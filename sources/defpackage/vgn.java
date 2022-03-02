package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: vgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgn extends LinearLayout {
    public vgn(Context context, String str) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.messages_opt_in_custom_title, this, true);
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("<b><font color=#17170435>");
        sb.append(str);
        sb.append("</font></b>");
        ((TextView) findViewById(R.id.title)).setText(Html.fromHtml(resources.getString(R.string.messages_opt_in_dialog_title, new Object[]{sb.toString()})));
    }
}
