import React from 'react'
import { render } from 'react-dom'
import { createStore } from 'redux'
import { Provider } from 'react-redux'
import App from './components/App'
import reducer from './reducers'
import { resetStore } from './actions' 

const store = createStore(reducer)
const store2 = createStore(reducer)

window.store2 = store2;
window.resetStore = resetStore;
window.render = render;
window.app1 = (<Provider store={store}>
    <App />
  </Provider>);
render(
  window.app1,
  document.getElementById('root')
)
window.app2 = (<Provider store={store2}>
    <App />
  </Provider>);
