package defpackage;

import android.os.Message;
import android.view.View;

/* renamed from: sh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sh implements View.OnClickListener {
    final /* synthetic */ sq a;

    public sh(sq sqVar) {
        this.a = sqVar;
    }

    public void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        sq sqVar = this.a;
        Message message4 = null;
        if (view == sqVar.j && (message3 = sqVar.l) != null) {
            message4 = Message.obtain(message3);
        } else if (view == sqVar.m && (message2 = sqVar.o) != null) {
            message4 = Message.obtain(message2);
        } else if (view == sqVar.p && (message = sqVar.r) != null) {
            message4 = Message.obtain(message);
        }
        if (message4 != null) {
            message4.sendToTarget();
        }
        sq sqVar2 = this.a;
        sqVar2.H.obtainMessage(1, sqVar2.b).sendToTarget();
    }
}
