package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: ahs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahs extends ContentObserver {
    final /* synthetic */ ahu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahs(ahu ahu) {
        super(new Handler());
        this.a = ahu;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        ahu ahu = this.a;
        if (ahu.c && (cursor = ahu.d) != null && !cursor.isClosed()) {
            ahu.b = ahu.d.requery();
        }
    }
}
