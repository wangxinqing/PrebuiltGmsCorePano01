package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oaw extends ClickableSpan {
    final /* synthetic */ HelpConfig a;
    final /* synthetic */ oiy b;
    final /* synthetic */ agxz c;

    public oaw(HelpConfig helpConfig, agxz agxz, oiy oiy) {
        this.a = helpConfig;
        this.c = agxz;
        this.b = oiy;
    }

    public void onClick(View view) {
        Account account = this.a.d;
        try {
            agxz.a(this.b, account == null ? "" : account.name);
        } catch (agxy e) {
            opa.a((Activity) this.b, Uri.parse(axmj.a.a().av()), this.a, this.b.y);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
