package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URISyntaxException;

/* renamed from: pud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pud implements View.OnClickListener {
    public String a = "";
    private final Context b;

    public pud(Context context) {
        this.b = context;
    }

    public void onClick(View view) {
        Intent intent;
        TextView textView = (TextView) view;
        String charSequence = textView.getText().toString();
        try {
            intent = Intent.parseUri(charSequence, 3);
        } catch (URISyntaxException e) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(charSequence));
        }
        intent.setFlags(268435456);
        if (this.a.isEmpty()) {
            oso.e("No package name set in intent for deep-linked indexable url.");
        } else if (!this.a.equals("com.google.android.gms")) {
            intent.setPackage(this.a);
        }
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            String str = this.a;
            String valueOf = String.valueOf(textView.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(" Cannot resolve URL. ");
            sb.append(valueOf);
            oso.e(sb.toString());
            Toast.makeText(this.b, String.valueOf(this.a).concat(" Cannot resolve URL."), 1).show();
        }
    }
}
