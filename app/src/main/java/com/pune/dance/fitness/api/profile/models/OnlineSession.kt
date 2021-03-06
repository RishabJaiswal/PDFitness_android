package com.pune.dance.fitness.api.profile.models

import com.google.firebase.firestore.IgnoreExtraProperties
import com.google.firebase.firestore.PropertyName

@IgnoreExtraProperties
data class OnlineSession(

    @get:PropertyName("title")
    @set:PropertyName("title")
    var title: String = "",

    @get:PropertyName("message")
    @set:PropertyName("message")
    var message: String = "",

    @get:PropertyName("link")
    @set:PropertyName("link")
    var link: String = "",

    @get:PropertyName("directions")
    @set:PropertyName("directions")
    var directions: String = "",

    @get:PropertyName("action_primary")
    @set:PropertyName("action_primary")
    var actionPrimaryText: String = "",

    @get:PropertyName("action_secondary")
    @set:PropertyName("action_secondary")
    var actionSecondaryText: String = "",

    @get:PropertyName("link_share")
    @set:PropertyName("link_share")
    var linkForSharing: String = "",

    @get:PropertyName("show_ad")
    @set:PropertyName("show_ad")
    var showAd: Boolean = true

)