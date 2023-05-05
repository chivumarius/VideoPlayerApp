package com.chivumarius.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        // ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        // ♦ DISPLAYING VIDEOS FROM  LOCAL STORAGE ♦
        // ♦ STEP 2:  "Declaring" and "Initializing" the "VideoView1" Widget:
        val videoView: VideoView = findViewById(R.id.videoview1)  // ♦ import android.widget.VideoView

        // ♦ Setting the "Path" of the "Local Video":
        videoView.setVideoPath(
            "android.resource://"
                    + packageName+"/"
                    + R.raw.mountains
        )

        // ♦ Creating an Object from "Media Controllers" Class
        //      → that allow us to See the "SeekBar", "Play Button",
        //      → "Pause Button", "Fast Forward Button", "BacK Button":
        val mediaController = MediaController(this)  // ♦ import android.widget.MediaController

        // ♦ Setting the "Anchor View"
        //      → to "VideoView" Widget
        //      → for "Media Controller":
        mediaController.setAnchorView(videoView)

        // ♦ Setting the "Media Player"
        //      → to "VideoView" Widget
        //      → for "Media Controller":
        mediaController.setMediaPlayer(videoView)

        // ♦ Setting the "Media Controller"
        //      → to "Media Controller" Object
        //      → for "VideoView" Widget:
        videoView.setMediaController(mediaController)

        // ♦ "Automatic Start" of the "Video" after "Launching" the "App":
        videoView.start()




        // ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
        // ♦ "DISPLAYING VIDEOS" FROM "INTERNET" ♦
        // ♦ STEP 2:  "Declaring" and "Initializing" the "VideoView2" Widget:
        val videoView2 : VideoView = findViewById(R.id.~)

        // ♦ Setting the "Path" of the "Online Video" → for "uri" Object:
        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")

        // ♦ Setting the "Video URI" → to "uri" Object
        //      → to "Fetching" the "Video" from the "Link" to "Display It":
        videoView2.setVideoURI(uri)

        // ♦ Creating "mediaController2" Object
        //      → from the "Media Controller" Class:
        val mediaController2 = MediaController(this)

        // ♦ Setting the "Anchor View"
        //      → to "VideoView2" Widget
        //      → for "Media Controller 2":
        mediaController2.setAnchorView(videoView2)

        // ♦ Setting the "Media Player"
        //      → to "Video View2" Widget
        //      → for "Media Controller 2":
        mediaController2.setMediaPlayer(videoView2)

        // ♦ Setting the "Media Controller"
        //      → to "Media Controller 2" Object
        //      → for "VideoView2" Widget:
        videoView2.setMediaController(mediaController2)

        // ♦ "Automatic Start" of the "Video 2" after "Launching" the "App":
        videoView2.start()
    }
}