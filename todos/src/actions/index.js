let nextTodoId = 0
export const addTodo = (text) => ({
  type: 'ADD_TODO',
  id: nextTodoId++,
  text
})

export const setVisibilityFilter = (filter) => ({
  type: 'SET_VISIBILITY_FILTER',
  filter
})

export const toggleTodo = (id) => ({
  type: 'TOGGLE_TODO',
  id
})

export const resetStore = () => ({
  type: 'RESET_STORE',
  note: 'test'
})

export const requestStories = () => ({
  type: 'REQUEST_STORIES'
})

export const receiveStories = (json) => ({
  type: 'RECEIVE_STORIES',
  stories: json,
  receivedAt: Date.now()
})

export function fetchStories() {
  return dispatch => {
    dispatch(requestStories())
    return fetch(`http://offline-news-api.herokuapp.com/stories`)
      .then(response => response.json(),error => console.log(error))
      .then(json => dispatch(receiveStories(json)),error => console.log(error))
  }
}
