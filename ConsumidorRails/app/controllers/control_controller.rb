class ControlController < ApplicationController
  def new
    @client = Savon::Client.new do
      wsdl.document = "http://localhost:8080/WebApplication1/CalculatorService?wsdl"
    end
  end

  def codes
    @client = Savon::Client.new do
      wsdl.document = "http://localhost:8080/WebApplication1/CalculatorService?wsdl"
    end
  end

  def restar
    @client = Savon::Client.new do
      wsdl.document = "http://localhost:8080/WebApplication1/CalculatorService?wsdl"
    end
    respuesta = @client.request :web, :restar, body: {"arg0"=> 3, "arg1" => 8}
    if respuesta.success?
      r = respuesta.to_array(:restar_response).first
      if r
        @resta = r[:return]
      end
    end
  end
end
