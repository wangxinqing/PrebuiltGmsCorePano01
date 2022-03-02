package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferChimeraActivity;
import java.util.ArrayList;

/* renamed from: accx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accx implements accl {
    private final SourceDirectTransferChimeraActivity a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private String f;

    public accx(SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity, String str, String str2, String str3, String str4, String str5) {
        int i;
        this.a = sourceDirectTransferChimeraActivity;
        this.b = str;
        this.c = str2;
        this.f = str5;
        this.d = str4;
        if ("deviceIconPhone".equals(str3)) {
            i = R.drawable.quantum_gm_ic_phone_android_gm_blue_36;
        } else if ("deviceIconWatch".equals(str3)) {
            i = R.drawable.quantum_ic_watch_googblue_36;
        } else if (!"deviceIconTv".equals(str3)) {
            String valueOf = String.valueOf(str3);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown device icon type (should be one of BootstrapConfigurations.DeviceIcon: ") : "Unknown device icon type (should be one of BootstrapConfigurations.DeviceIcon: ".concat(valueOf));
        } else {
            i = R.drawable.quantum_gm_ic_tv_gm_blue_36;
        }
        this.e = i;
    }

    private final String a(int i) {
        return this.a.getString(i);
    }

    public final Fragment a(int i, Bundle bundle) {
        ArrayList arrayList;
        Fragment fragment;
        String str;
        if (bundle != null) {
            arrayList = bundle.getParcelableArrayList("extraAccountChallengeData");
        } else {
            arrayList = new ArrayList();
        }
        if (i != 2) {
            if (i == 3) {
                acdf acdf = new acdf();
                acdf.a = this.e;
                acdf.b = this.c;
                acdf.c = this.b;
                acdf.b(a(R.string.common_cancel), 2002);
                acdf.a(a(R.string.smartdevice_action_copy), 2001);
                fragment = acdf.a();
            } else if (i == 4) {
                if (TextUtils.isEmpty(this.f)) {
                    if (azmd.c()) {
                        str = this.a.getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, arrayList.size());
                    } else {
                        str = a(R.string.smartdevice_d2d_target_copying_accounts);
                    }
                    this.f = str;
                }
                acdf acdf2 = new acdf();
                acdf2.a = this.e;
                acdf2.b = this.f;
                fragment = acdf2.a();
            } else if (i == 5) {
                String string = bundle.getString("extraRestoreAccount");
                bundle.remove("extraAccountChallengeData");
                bundle.remove("extraRestoreAccount");
                fragment = ackh.a(arrayList, string);
            } else if (i == 7) {
                return acpk.a(this.a.getContainerActivity(), 1);
            } else {
                StringBuilder sb = new StringBuilder(59);
                sb.append("Illegal state: an unknown fragment was started: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            }
        } else if (azll.b()) {
            fragment = acmo.a(this.c, this.b, (String) null, this.d, this.e, false);
        } else {
            fragment = acmo.b();
        }
        if (bundle != null) {
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putAll(bundle);
            fragment.setArguments(arguments);
        }
        return fragment;
    }
}
