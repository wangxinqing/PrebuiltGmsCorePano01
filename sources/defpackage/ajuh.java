package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.material.chip.Chip;

/* renamed from: ajuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajuh extends rq {
    final /* synthetic */ Chip f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajuh(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    /* access modifiers changed from: protected */
    public final int a(float f2, float f3) {
        Chip chip = this.f;
        Rect rect = Chip.a;
        return (!chip.c() || !this.f.d().contains(f2, f3)) ? 0 : 1;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, qs qsVar) {
        CharSequence charSequence = "";
        if (i == 1) {
            CharSequence text = this.f.getText();
            Context context = this.f.getContext();
            Object[] objArr = new Object[1];
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            objArr[0] = charSequence;
            qsVar.d((CharSequence) context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            Chip chip = this.f;
            Rect rect = Chip.a;
            qsVar.b(chip.e());
            qsVar.a(qp.a);
            qsVar.d(this.f.isEnabled());
            return;
        }
        qsVar.d(charSequence);
        qsVar.b(Chip.a);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f;
            Rect rect = Chip.a;
            chip.e = z;
            chip.refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r1.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r2) {
        /*
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            com.google.android.material.chip.Chip r2 = r1.f
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.a
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x001e
            com.google.android.material.chip.Chip r2 = r1.f
            ajuj r0 = r2.b
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.d
            if (r0 == 0) goto L_0x001e
            android.view.View$OnClickListener r2 = r2.c
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajuh.a(java.util.List):void");
    }

    /* access modifiers changed from: protected */
    public final void a(qs qsVar) {
        String str;
        qsVar.a(this.f.f());
        qsVar.c(this.f.isClickable());
        if (this.f.f() || this.f.isClickable()) {
            if (!this.f.f()) {
                str = "android.widget.Button";
            } else {
                str = "android.widget.CompoundButton";
            }
            qsVar.a((CharSequence) str);
        } else {
            qsVar.a((CharSequence) "android.view.View");
        }
        CharSequence text = this.f.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            qsVar.b(text);
        } else {
            qsVar.d(text);
        }
    }

    public final boolean a(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f.performClick();
            }
            if (i == 1) {
                this.f.g();
            }
        }
        return false;
    }
}
