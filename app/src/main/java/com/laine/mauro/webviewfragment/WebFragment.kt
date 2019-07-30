package com.laine.mauro.webviewfragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.laine.mauro.webviewfragment.MainActivity.Companion.WEB_VIEW_URL
import kotlinx.android.synthetic.main.web_view_fragment.view.*


class WebFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.web_view_fragment, container, false)
        view.web_view.webViewClient = WebViewClient()
        view.web_view.loadUrl(WEB_VIEW_URL)
        return view
    }
}
