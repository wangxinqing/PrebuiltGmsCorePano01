package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: zh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zh implements DialogInterface.OnClickListener, zo {
    ss a;
    final /* synthetic */ AppCompatSpinner b;
    private ListAdapter c;
    private CharSequence d;

    public zh(AppCompatSpinner appCompatSpinner) {
        this.b = appCompatSpinner;
    }

    public final CharSequence a() {
        return this.d;
    }

    public final void a(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final Drawable b() {
        return null;
    }

    public final int c() {
        return 0;
    }

    public final void d() {
        ss ssVar = this.a;
        if (ssVar != null) {
            ssVar.dismiss();
            this.a = null;
        }
    }

    public final boolean e() {
        ss ssVar = this.a;
        if (ssVar != null) {
            return ssVar.isShowing();
        }
        return false;
    }

    public final int f() {
        return 0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick((View) null, i, this.c.getItemId(i));
        }
        d();
    }

    public final void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void b(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void a(int i, int i2) {
        if (this.c != null) {
            sr srVar = new sr(this.b.a);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                srVar.b(charSequence);
            }
            ListAdapter listAdapter = this.c;
            int selectedItemPosition = this.b.getSelectedItemPosition();
            sn snVar = srVar.a;
            snVar.q = listAdapter;
            snVar.r = this;
            snVar.w = selectedItemPosition;
            snVar.v = true;
            ss b2 = srVar.b();
            this.a = b2;
            ListView a2 = b2.a();
            int i3 = Build.VERSION.SDK_INT;
            a2.setTextDirection(i);
            a2.setTextAlignment(i2);
            this.a.show();
        }
    }

    public final void a(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
