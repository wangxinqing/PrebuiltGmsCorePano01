package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.Locale;

/* renamed from: fkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkv implements fit {
    private final Context a;

    public fkv(Context context) {
        this.a = context.getApplicationContext();
    }

    public final aorr a(pyv pyv, HintRequest hintRequest) {
        if (!hintRequest.d) {
            return aorl.a((Object) amzy.h());
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        String str = null;
        if (telephonyManager != null) {
            String line1Number = telephonyManager.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = Locale.getDefault().getCountry();
                }
                str = fch.a(line1Number, simCountryIso);
            }
        }
        if (str != null) {
            return aorl.a((Object) amzy.a((Object) new eug(str).a()));
        }
        return aorl.a((Object) amzy.h());
    }
}
