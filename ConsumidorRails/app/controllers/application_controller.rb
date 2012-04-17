class ApplicationController < ActionController::Base
  protect_from_forgery

  helper_method :soap_service

  def soap_service
    @client = Savon::Client.new do
      wsdl.document = "http://localhost:8080/WebService/login?wsdl"
    end
  end

end
