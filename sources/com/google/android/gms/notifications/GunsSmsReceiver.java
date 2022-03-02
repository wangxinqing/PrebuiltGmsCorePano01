package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GunsSmsReceiver extends nla {
    private final WebView a;

    public GunsSmsReceiver(WebView webView) {
        super("notifications");
        this.a = webView;
    }

    public final void a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(aynt.a.a().c());
        for (SmsMessage displayMessageBody : messagesFromIntent) {
            Matcher matcher = compile.matcher(displayMessageBody.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            WebView webView = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("javascript:onSmsReceived('");
            sb.append(str);
            sb.append("')");
            webView.loadUrl(sb.toString());
        }
    }
}
