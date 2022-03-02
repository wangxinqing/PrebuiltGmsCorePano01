package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oav extends ClickableSpan {
    final /* synthetic */ nzu a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ avmt c;

    public oav(nzu nzu, HelpConfig helpConfig, avmt avmt) {
        this.a = nzu;
        this.b = helpConfig;
        this.c = avmt;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        nzu nzu = this.a;
        nzu.k();
        Intent putExtra = intent.setClassName((Context) nzu, "com.google.android.gms.feedback.PreviewActivity").putExtra("EXTRA_HELP_CONFIG", this.b).putExtra("EXTRA_START_TICK", this.b.S);
        nzu nzu2 = this.a;
        nzu2.k();
        ((Context) nzu2).startActivity(putExtra);
        okg.a(this.a, this.c);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
