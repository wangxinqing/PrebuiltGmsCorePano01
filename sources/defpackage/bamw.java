package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bamw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bamw {
    public final Logger a;
    public final Level b;

    public bamw(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        amrl.a((Object) level, (Object) "level");
        this.b = level;
        amrl.a((Object) logger, (Object) "logger");
        this.a = logger;
    }

    private static String a(batd batd) {
        long j = batd.b;
        if (j > 64) {
            return String.valueOf(batd.b((int) Math.min(j, 64)).c()).concat("...");
        }
        return batd.o().c();
    }

    public final void a(int i, int i2, long j) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            StringBuilder sb = new StringBuilder(a2.length() + 77);
            sb.append(a2);
            sb.append(" WINDOW_UPDATE: streamId=");
            sb.append(i2);
            sb.append(" windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }

    public final void a(int i, int i2, bany bany) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            String valueOf = String.valueOf(bany);
            StringBuilder sb = new StringBuilder(a2.length() + 44 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(" RST_STREAM: streamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    public final void a(int i, int i2, bany bany, batg batg) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            String valueOf = String.valueOf(bany);
            int e = batg.e();
            batd batd = new batd();
            batd.b(batg);
            String a3 = a(batd);
            int length = a2.length();
            StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(valueOf).length() + String.valueOf(a3).length());
            sb.append(a2);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            sb.append(" length=");
            sb.append(e);
            sb.append(" bytes=");
            sb.append(a3);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    public final void a(int i, int i2, batd batd, int i3, boolean z) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            String a3 = a(batd);
            StringBuilder sb = new StringBuilder(a2.length() + 69 + String.valueOf(a3).length());
            sb.append(a2);
            sb.append(" DATA: streamId=");
            sb.append(i2);
            sb.append(" endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(a3);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    public final void a(int i, long j) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            StringBuilder sb = new StringBuilder(a2.length() + 43);
            sb.append(a2);
            sb.append(" PING: ack=false bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb.toString());
        }
    }

    public final void a(int i, baom baom) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a2 = bamu.a(i);
            EnumMap enumMap = new EnumMap(bamv.class);
            for (bamv bamv : bamv.values()) {
                if (baom.a(bamv.g)) {
                    enumMap.put(bamv, Integer.valueOf(baom.b(bamv.g)));
                }
            }
            String enumMap2 = enumMap.toString();
            StringBuilder sb = new StringBuilder(a2.length() + 30 + String.valueOf(enumMap2).length());
            sb.append(a2);
            sb.append(" SETTINGS: ack=false settings=");
            sb.append(enumMap2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb.toString());
        }
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }
}
