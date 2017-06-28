import React from 'react'
import { render } from 'react-dom'
import { App } from './App'

window.React = React

require("./style/main.css");

render(
    (
        <div>
            <App />
        </div>
    ),
        document.getElementById('react-content')
);

