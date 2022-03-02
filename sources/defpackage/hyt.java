package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hyt implements ax {
    private final hyu a;

    public hyt(hyu hyu) {
        this.a = hyu;
    }

    public final void a(Object obj) {
        String str;
        pzh pzh;
        String str2;
        String str3;
        List list = (List) obj;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.a.b;
        iad iad = accountPickerChimeraActivity.c;
        if (iad != null) {
            ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
            TextView textView = (TextView) accountPickerChimeraActivity.findViewById(R.id.selected_account_name);
            Bitmap bitmap = null;
            if (!azge.b()) {
                pzh = null;
                str = null;
            } else if (accountPickerChimeraActivity.e != null) {
                aoru a2 = jfm.a(9);
                accountPickerChimeraActivity.f = new agcf(new jls((Handler) new qvr(Looper.getMainLooper())));
                hyv hyv = new hyv();
                AccountParticleDisc.a(accountPickerChimeraActivity, accountPickerChimeraActivity.f, a2, hyv, hyv, pzh.class);
                pzh = (pzh) anbs.d(arrayList, new hys(accountPickerChimeraActivity)).c();
                if (pzh == null) {
                    AccountPickerChimeraActivity.a.d("The selected account is not part of the accounts' list.", new Object[0]);
                    View view = accountPickerChimeraActivity.h;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    TextView textView2 = accountPickerChimeraActivity.g;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    str = null;
                } else {
                    arrayList.remove(pzh);
                    str = pzh.d;
                    TextView textView3 = accountPickerChimeraActivity.g;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
            } else {
                pzh = null;
                str = null;
            }
            if (accountPickerChimeraActivity.g == null) {
                arrayList.add(0, pzh.a(accountPickerChimeraActivity.getString(R.string.common_account_account_chip_subtitle, new Object[]{accountPickerChimeraActivity.b})));
            }
            if (jgu.g(accountPickerChimeraActivity)) {
                arrayList.add(pzh.a());
            }
            if (azge.b()) {
                if (accountPickerChimeraActivity.m) {
                    arrayList.add(new pzh((String) null, (String) null, 3, (String) null));
                }
                String str4 = "";
                if (!(accountPickerChimeraActivity.h == null || accountPickerChimeraActivity.e == null || !accountPickerChimeraActivity.m)) {
                    if (TextUtils.isEmpty(str)) {
                        Account account = accountPickerChimeraActivity.e;
                        str3 = account != null ? account.name : str4;
                    } else {
                        str3 = str;
                    }
                    textView.setText(str3);
                    AccountParticleDisc accountParticleDisc = (AccountParticleDisc) accountPickerChimeraActivity.findViewById(R.id.account_particle_disc);
                    accountParticleDisc.a((agbv) accountPickerChimeraActivity.f, pzh.class);
                    accountParticleDisc.a((Object) pzh);
                }
                if (str != null && accountPickerChimeraActivity.m && accountPickerChimeraActivity.h == null) {
                    if (TextUtils.isEmpty(str)) {
                        Account account2 = accountPickerChimeraActivity.e;
                        str = account2 != null ? account2.name : str4;
                    }
                    Account account3 = accountPickerChimeraActivity.e;
                    if (account3 != null) {
                        str2 = account3.name;
                    } else {
                        str2 = str4;
                    }
                    Account account4 = accountPickerChimeraActivity.e;
                    if (account4 != null) {
                        str4 = account4.type;
                    }
                    pzh pzh2 = new pzh(str, str2, 4, str4);
                    if (pzh != null) {
                        bitmap = pzh.e;
                    }
                    pzh2.e = bitmap;
                    arrayList.add(0, pzh2);
                }
            }
            iad.e = arrayList;
            iad.as();
        }
    }
}
