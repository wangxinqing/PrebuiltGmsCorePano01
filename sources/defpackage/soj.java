package defpackage;

import java.util.Locale;

/* renamed from: soj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class soj extends sok {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    public soj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str;
        uow uow = (uow) obj;
        int i = this.a;
        int i2 = this.b;
        anih anih = (anih) ((anih) ulh.a.d()).a("uow", "a", 888, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        switch (i2) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "ERROR_NOT_RESPONSE_MESSAGE";
                break;
            case 2:
                str = "ERROR_NO_ANSWERS";
                break;
            case 3:
                str = "ERROR_READING_RECORD_NAME";
                break;
            case 4:
                str = "ERROR_READING_A_RDATA";
                break;
            case 5:
                str = "ERROR_READING_AAAA_RDATA";
                break;
            case 6:
                str = "ERROR_READING_PTR_RDATA";
                break;
            case 7:
                str = "ERROR_SKIPPING_PTR_RDATA";
                break;
            case 8:
                str = "ERROR_READING_SRV_RDATA";
                break;
            case 9:
                str = "ERROR_SKIPPING_SRV_RDATA";
                break;
            case 10:
                str = "ERROR_READING_TXT_RDATA";
                break;
            case 11:
                str = "ERROR_SKIPPING_UNKNOWN_RECORD";
                break;
            case 12:
                str = "ERROR_END_OF_FILE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        anih.a("Failed to parse packet %d: %s", i, (Object) String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i2), str}));
    }
}
