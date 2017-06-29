import { combineReducers } from 'redux'
import todos from './todos'
import visibilityFilter from './visibilityFilter'
import stories from './stories'


export const todoApp = combineReducers({
  todos,
  visibilityFilter
})

export const storiesApp = combineReducers({
  stories
})

