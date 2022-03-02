package defpackage;

import android.accounts.Account;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hzn implements ax {
    private final SimpleDialogAccountPickerChimeraActivity a;

    public hzn(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.a = simpleDialogAccountPickerChimeraActivity;
    }

    public final void a(Object obj) {
        String str;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.a;
        List list = (List) obj;
        if (list != null) {
            if (jgu.g(simpleDialogAccountPickerChimeraActivity)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(pzh.a());
                list = arrayList;
            }
            Account account = simpleDialogAccountPickerChimeraActivity.d.e;
            if (simpleDialogAccountPickerChimeraActivity.g == -1 && account != null) {
                simpleDialogAccountPickerChimeraActivity.g = anbs.e(list, new hzo(account));
            }
            boolean z = true;
            if (TextUtils.isEmpty(simpleDialogAccountPickerChimeraActivity.d.f)) {
                str = simpleDialogAccountPickerChimeraActivity.getString(R.string.common_account_choose_account_for_app_label, new Object[]{simpleDialogAccountPickerChimeraActivity.b});
            } else {
                str = simpleDialogAccountPickerChimeraActivity.d.f;
            }
            sr srVar = new sr(simpleDialogAccountPickerChimeraActivity);
            srVar.b((CharSequence) str);
            srVar.b(17039370, (DialogInterface.OnClickListener) new hzp(simpleDialogAccountPickerChimeraActivity, list));
            srVar.a(17039360, (DialogInterface.OnClickListener) new hzq(simpleDialogAccountPickerChimeraActivity));
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pzh pzh = (pzh) list.get(i);
                int i2 = pzh.a;
                if (i2 == 0) {
                    String str2 = pzh.c;
                    amrl.a((Object) str2);
                    strArr[i] = str2;
                } else if (i2 == 2) {
                    strArr[i] = simpleDialogAccountPickerChimeraActivity.getResources().getString(R.string.common_add_account);
                }
            }
            srVar.a(strArr, simpleDialogAccountPickerChimeraActivity.g, hzr.a);
            ss b = srVar.b();
            try {
                Method declaredMethod = b.getClass().getDeclaredMethod("onCreate", new Class[]{Bundle.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(b, new Object[]{null});
                Button a2 = b.a(-1);
                if (simpleDialogAccountPickerChimeraActivity.g < 0) {
                    z = false;
                }
                a2.setEnabled(z);
                simpleDialogAccountPickerChimeraActivity.f = b.a();
                simpleDialogAccountPickerChimeraActivity.f.setOnItemClickListener(new hzs(simpleDialogAccountPickerChimeraActivity, b));
                Window window = b.getWindow();
                if (window != null) {
                    ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                    ViewGroup viewGroup2 = (ViewGroup) simpleDialogAccountPickerChimeraActivity.getWindow().getDecorView();
                    qb.a((View) viewGroup2, qb.o(viewGroup));
                    qb.a((View) viewGroup, 0.0f);
                    viewGroup2.setBackground(viewGroup.getBackground());
                    viewGroup.setBackground((Drawable) null);
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeViewAt(0);
                    simpleDialogAccountPickerChimeraActivity.setContentView(childAt);
                }
            } catch (Exception e) {
                SimpleDialogAccountPickerChimeraActivity.a.e("Cannot call onCreate on Dialog", e, new Object[0]);
                simpleDialogAccountPickerChimeraActivity.setResult(0);
                simpleDialogAccountPickerChimeraActivity.finish();
            }
        }
    }
}
