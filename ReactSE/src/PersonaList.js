import { Persona } from './Persona'

export const PersonaList = ({persone}) => (
    <ul>
        {persone.map((pers, i) =>
            (
                <li key={i}><Persona {...pers} /></li>
            )
        )
        }
    </ul>
)