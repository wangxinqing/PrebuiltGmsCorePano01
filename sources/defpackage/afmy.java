package defpackage;

import java.io.File;

/* renamed from: afmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmy implements afzq {
    private final agz a;

    public afmy(agz agz) {
        this.a = agz;
    }

    public final void a(File file, long j) {
        file.getName();
        this.a.a((Object) null);
    }

    public final void a(File file, afzp afzp) {
        afke afke;
        Object[] objArr = {"DownloadCompleteHandler", file.getName(), afzp.a};
        agz agz = this.a;
        afkd a2 = afkf.a();
        afzo afzo = afzp.a;
        afzo afzo2 = afzo.UNKNOWN;
        switch (afzo.ordinal()) {
            case 0:
                afke = afke.ANDROID_DOWNLOADER_UNKNOWN;
                break;
            case 1:
                afke = afke.ANDROID_DOWNLOADER_CANCELED;
                break;
            case 2:
                afke = afke.ANDROID_DOWNLOADER_INVALID_REQUEST;
                break;
            case 3:
                afke = afke.ANDROID_DOWNLOADER_HTTP_ERROR;
                break;
            case 4:
                afke = afke.ANDROID_DOWNLOADER_REQUEST_ERROR;
                break;
            case 5:
                afke = afke.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                break;
            case 6:
                afke = afke.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                break;
            case 7:
                afke = afke.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                break;
            case 8:
                afke = afke.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                break;
            case 9:
                afke = afke.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                break;
            case 10:
                afke = afke.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                break;
            case 11:
                afke = afke.ANDROID_DOWNLOADER_OAUTH_ERROR;
                break;
            default:
                afke = afke.UNKNOWN_ERROR;
                break;
        }
        a2.a = afke;
        String name = afzp.a.name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
        sb.append("ANDROID_DOWNLOADER_");
        sb.append(name);
        sb.append("; ");
        String sb2 = sb.toString();
        if (afzp.b >= 0) {
            String valueOf = String.valueOf(sb2);
            int i = afzp.b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb3.append(valueOf);
            sb3.append("HttpCode: ");
            sb3.append(i);
            sb3.append("; ");
            sb2 = sb3.toString();
        }
        if (afzp.c != null) {
            String valueOf2 = String.valueOf(sb2);
            String str = afzp.c;
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 11 + String.valueOf(str).length());
            sb4.append(valueOf2);
            sb4.append("Message: ");
            sb4.append(str);
            sb4.append("; ");
            sb2 = sb4.toString();
        }
        if (afzp.d != null) {
            String valueOf3 = String.valueOf(sb2);
            String str2 = afzp.d;
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 13 + String.valueOf(str2).length());
            sb5.append(valueOf3);
            sb5.append("AuthToken: ");
            sb5.append(str2);
            sb5.append("; ");
            sb2 = sb5.toString();
        }
        a2.b = sb2;
        agz.a((Throwable) a2.a());
    }
}
