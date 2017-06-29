import  React from 'react'
import thunkMiddleware from 'redux-thunk'
import { render, unmountComponentAtNode } from 'react-dom'
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import App from './components/App'
import App2 from './components/App2'
import { todoApp, storiesApp } from './reducers'
import { resetStore, fetchStories } from './actions' 

const store = createStore(todoApp)
const store2 = createStore(storiesApp,
              applyMiddleware(thunkMiddleware))
store2.dispatch(fetchStories())

window.store2 = store2;
window.resetStore = resetStore;
window.render = render;
window.unmountComponentAtNode = unmountComponentAtNode;

window.app1 = (<Provider store={store}>
    <App />
  </Provider>);
render(
  window.app1,
  document.getElementById('root')
)
var app2 = (<Provider store={store2}>
    <App2 />
  </Provider>);
render(
    app2,
    document.getElementById('root2')
)