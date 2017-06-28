//import { createClass } from 'react'
import { Component } from 'react'
import { PersonaList } from './PersonaList'

// see: https://stackoverflow.com/documentation/reactjs/6371/react-createclass-vs-extends-react-component#t=201706281518286896976

//export const App = createClass({
export class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            persone: [
                {
                    nome: 'Mario',
                    cognome: 'Rossi',
                    indirizzo: 'Roma'
                },
                {
                    nome: 'Anna',
                    cognome: 'Bianchi',
                    indirizzo: 'Milano'
                }
            ]
        }
    }
    /*
    getInitialState() {
        return {
            persone: [
                {
                    nome: 'Mario',
                    cognome: 'Rossi',
                    indirizzo: 'Roma'
                },
                {
                    nome: 'Anna',
                    cognome: 'Bianchi',
                    indirizzo: 'Milano'
                }
            ]
        }
    },
    */
    aggiungiPersona = () => {
        console.log(this);
        var persone = [...this.state.persone];
        persone.push({
            nome: 'Luisa',
            cognome: 'Verdi',
            indirizzo: 'Genova'
        });
        this.setState({persone});
    }
    render() {
        return (
            <div>
                <PersonaList persone={this.state.persone} />
                <button onClick={this.aggiungiPersona}>Aggiungi persona</button>
            </div>
        )
    }
}