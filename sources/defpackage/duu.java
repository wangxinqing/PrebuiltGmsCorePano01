package defpackage;

import android.os.IInterface;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: duu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface duu extends IInterface {
    void a(GetRecentContextCall$Request getRecentContextCall$Request, dux dux);

    void a(dux dux);

    void a(dux dux, String str);

    void a(dux dux, UsageInfo[] usageInfoArr);

    void a(dux dux, ActionImpl[] actionImplArr);
}
