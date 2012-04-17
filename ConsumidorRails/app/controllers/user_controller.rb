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
        entro = @respuesta[0]
        @mensaje = @respuesta[1]
        if entro
          @token = @respuesta[2]
        else
          flash[:error] = @mensaje
          redirect_to root_path
        end
      end
    end
  end

end
