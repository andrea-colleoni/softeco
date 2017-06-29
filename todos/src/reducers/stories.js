const stories = (state = [], action) => {
  switch (action.type) {
      case 'RECEIVE_STORIES':
        return [...action.stories]
      default:
        return state
  }
}
export default stories