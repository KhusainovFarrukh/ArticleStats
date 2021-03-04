package khusainov.farrukh.communityapp.ui.recycler.callback

import androidx.recyclerview.widget.DiffUtil
import khusainov.farrukh.communityapp.data.model.Topic

class TopicCallback : DiffUtil.ItemCallback<Topic>() {
    override fun areItemsTheSame(oldItem: Topic, newItem: Topic): Boolean {
        return oldItem.topicId == newItem.topicId
    }

    override fun areContentsTheSame(oldItem: Topic, newItem: Topic): Boolean {
        return oldItem == newItem
    }
}