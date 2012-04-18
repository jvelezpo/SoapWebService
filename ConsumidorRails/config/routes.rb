SoapApp::Application.routes.draw do
  get "pages/home"

  get "pages/about"

  get "user/index"
  post "user/new"

  get "control/new"
  get "control/codes"
  get "control/restar"

  root :to => 'user#index'
end
