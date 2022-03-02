package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.location.FloorChangeEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aipl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipl extends airh {
    public aipl(ikh ikh) {
        super("FloorChangeDetectionListeners", 2023, ikh);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aipr a(PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ajbg ajbg) {
        Boolean bool = (Boolean) obj;
        return new aipr(pendingIntent, 0, ajbg, ajrb, z, false, str);
    }

    /* access modifiers changed from: protected */
    public final void b(aipr aipr) {
        this.a.a(aico.FLOOR_CHANGE_REQUEST_DROPPED, aipr.h.hashCode(), aipr.h.getTargetPackage());
    }

    /* access modifiers changed from: protected */
    public final void c(aipr aipr) {
        this.a.a(aico.FLOOR_CHANGE_REQUEST_REMOVED, aipr.h.hashCode(), aipr.h.getTargetPackage());
    }

    /* access modifiers changed from: protected */
    public final void d(aipr aipr) {
        aicn aicn = this.a;
        int hashCode = aipr.h.hashCode();
        String targetPackage = aipr.h.getTargetPackage();
        aicn.a((aicl) new aiqs(aico.FLOOR_CHANGE_REQUEST_ADDED, aicn.b(), aicn.a(targetPackage), hashCode, hashCode, targetPackage, aipr.m));
    }

    /* access modifiers changed from: protected */
    public final int h() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ Object i() {
        return Boolean.valueOf(!this.h.isEmpty());
    }

    /* access modifiers changed from: protected */
    public final Intent a(aipr aipr) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_PENDING_INTENT", aipr.h);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Bundle bundle, aipr aipr, Intent intent) {
        List<FloorChangeEvent> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (FloorChangeEvent a : list) {
            arrayList.add(ivy.a(a));
        }
        intent.putExtra("com.google.android.location.internal.EXTRA_FLOOR_CHANGE_RESULT", arrayList);
        return true;
    }
}
