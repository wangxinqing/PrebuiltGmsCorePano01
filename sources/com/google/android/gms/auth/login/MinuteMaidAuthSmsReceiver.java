package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MinuteMaidAuthSmsReceiver extends nla {
    private static final iwd a = ehv.a("MinuteMaid", "MinuteMaidFragment");
    private final WebView b;

    public MinuteMaidAuthSmsReceiver(WebView webView) {
        super("auth_account");
        this.b = webView;
    }

    public final void a(Context context, Intent intent) {
        a.a("Receive sms...", new Object[0]);
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(ent.Y());
        for (SmsMessage displayMessageBody : messagesFromIntent) {
            Matcher matcher = compile.matcher(displayMessageBody.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            WebView webView = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("javascript:onSmsReceived('");
            sb.append(str);
            sb.append("')");
            webView.loadUrl(sb.toString());
        }
    }
}
