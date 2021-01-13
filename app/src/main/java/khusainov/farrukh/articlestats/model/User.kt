package khusainov.farrukh.articlestats.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("email")
    val email: String,
    @SerializedName("profile")
    val profile: Profile
)

data class Profile(
    @SerializedName("counts")
    val userStats: UserStats,
    val score: Int,
    val picture: String,
    val name: String
)

data class UserStats(
    @SerializedName("receivedLikes")
    val likes: Int,
    @SerializedName("replies")
    val comments: Int,
    val groups: Int,
    @SerializedName("posts")
    val articles: Int,
    val followings: Int,
    val followers: Int
)

data class SignInData(
    val email: String,
    val password: String
)