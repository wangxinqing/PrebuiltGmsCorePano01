package defpackage;

import com.google.android.gms.auth.uiflows.addaccount.setupwizard.BufferedLogsUploadIntentOperation;

/* renamed from: gmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class gmr implements Runnable {
    private final BufferedLogsUploadIntentOperation a;
    private final String b;

    public gmr(BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation, String str) {
        this.a = bufferedLogsUploadIntentOperation;
        this.b = str;
    }

    public final void run() {
        BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation = this.a;
        String str = this.b;
        BufferedLogsUploadIntentOperation.a.b("Uploading buffered logs to clearcut", new Object[0]);
        ((ahgz) bufferedLogsUploadIntentOperation.d.a.b.a()).b(Boolean.valueOf(bufferedLogsUploadIntentOperation.b.a(str)));
        bufferedLogsUploadIntentOperation.c.a(str);
    }
}
