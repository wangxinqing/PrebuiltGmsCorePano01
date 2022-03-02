package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oax extends ClickableSpan {
    final /* synthetic */ oiy a;
    final /* synthetic */ HelpConfig b;

    public oax(oiy oiy, HelpConfig helpConfig) {
        this.a = oiy;
        this.b = helpConfig;
    }

    public void onClick(View view) {
        opa.a((Activity) this.a, Uri.parse(axmj.a.a().aL()), this.b, this.a.y);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
