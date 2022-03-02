package com.google.android.gms.common.account;

import android.accounts.Account;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.google.android.gms.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OriginalSimpleAccountPickerChimeraActivity extends hzd {
    Button a;

    /* access modifiers changed from: protected */
    public final void e() {
        sr srVar = new sr(this);
        boolean z = true;
        srVar.b((CharSequence) getString(R.string.common_account_choose_account_for_app_label, new Object[]{l()}));
        srVar.b(17039370, (DialogInterface.OnClickListener) new hzj(this));
        srVar.a(17039360, (DialogInterface.OnClickListener) new hzi(this));
        ArrayList f = f();
        String[] strArr = new String[(f.size() + (this.e ? 1 : 0))];
        for (int i = 0; i < f.size(); i++) {
            strArr[i] = ((Account) f.get(i)).name;
        }
        if (this.e) {
            strArr[f.size()] = getResources().getString(R.string.common_add_account);
        }
        srVar.a(strArr, this.d, (DialogInterface.OnClickListener) null);
        ss b = srVar.b();
        try {
            Method declaredMethod = b.getClass().getDeclaredMethod("onCreate", new Class[]{Bundle.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(b, new Object[]{null});
            Button a2 = b.a(-1);
            this.a = a2;
            if (this.d == -1) {
                z = false;
            }
            a2.setEnabled(z);
            this.h = b.a();
            this.h.setOnItemClickListener(new hzk(this, b));
            Window window = b.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                ViewGroup viewGroup2 = (ViewGroup) getWindow().getDecorView();
                qb.a((View) viewGroup2, qb.o(viewGroup));
                qb.a((View) viewGroup, 0.0f);
                viewGroup2.setBackground(viewGroup.getBackground());
                viewGroup.setBackground((Drawable) null);
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeViewAt(0);
                setContentView(childAt);
            }
        } catch (Exception e) {
            Log.wtf("Cannot call onCreate on Dialog", e);
            setResult(0);
            finish();
        }
    }
}
