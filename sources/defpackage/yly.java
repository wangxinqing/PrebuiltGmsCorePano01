package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: yly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yly implements icm {
    final /* synthetic */ ymb a;

    public yly(ymb ymb) {
        this.a = ymb;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        this.a.getActivity().runOnUiThread(new ylx(this, (Status) icl));
    }
}
