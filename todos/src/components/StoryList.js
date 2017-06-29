import React from 'react'
import Story from './Story'

const StoryList = ({ stories }) => (
  <ul style={{minHeight: 100, minWidth: 100, backgroundColor: 'gray'}}>
    {stories.map(story =>
      <Story
        key={story.guid}
        {...story}
      />
    )}
  </ul>
)


export default StoryList
