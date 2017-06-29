import { connect } from 'react-redux'
import StoryList from '../components/StoryList'

const mapStateToProps = (state) => ({
  stories: state.stories
})

const StoryContainer = connect(
  mapStateToProps
)(StoryList)

export default StoryContainer