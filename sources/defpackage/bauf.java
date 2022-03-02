package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: bauf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bauf implements baui {
    final /* synthetic */ File a;

    public bauf(File file) {
        this.a = file;
    }

    public final FileChannel a() {
        return new FileInputStream(this.a).getChannel();
    }
}
