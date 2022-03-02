package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;

/* renamed from: yzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzc extends ClickableSpan {
    private final Context a;
    private final String b;
    private final String c;
    private final String d;

    public yzc(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public void onClick(View view) {
        if (view.getResources().getBoolean(R.bool.show_dpad_navigable_web_view)) {
            Context context = view.getContext();
            String str = this.d;
            Intent intent = new Intent("com.google.android.gms.plus.action.DPAD_WEBVIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
            return;
        }
        String str2 = this.d;
        String str3 = this.c;
        Bundle bundle = new Bundle();
        bundle.putString("secureUrl", str2);
        bundle.putString("prettyUrl", str2);
        bundle.putString("title", str3);
        yzl yzl = new yzl();
        yzl.setArguments(bundle);
        yzl.show(((FragmentActivity) view.getContext()).getSupportFragmentManager(), this.b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources resources = this.a.getResources();
        textPaint.setUnderlineText(resources.getBoolean(R.bool.plus_links_underlined));
        textPaint.setColor(resources.getColor(R.color.plus_oob_link_color));
    }
}
