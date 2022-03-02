package defpackage;

import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: ylw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylw implements icm {
    final /* synthetic */ ymb a;

    public ylw(ymb ymb) {
        this.a = ymb;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        this.a.getActivity().runOnUiThread(new ylv(this, (BleDevicesResult) icl));
    }
}
