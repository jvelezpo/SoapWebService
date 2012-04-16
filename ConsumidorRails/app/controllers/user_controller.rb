class UserController < ApplicationController
  def index
  end

  def new
    @cedula = params[:cedula]
    @pass = params[:password]
    @client = soap_service
    respuesta = @client.request :web, :ingresar, body: {"arg0"=> @cedula, "arg1" => @pass}
    if respuesta.success?
      r = respuesta.to_array(:ingresar_response).first
      if r
        @respuesta = r[:return]
      end
    end
  end

  private

  def soap_service
    @client = Savon::Client.new do
      wsdl.document = "http://localhost:8080/WebService/CalculatorService?wsdl"
    end
  end
end
