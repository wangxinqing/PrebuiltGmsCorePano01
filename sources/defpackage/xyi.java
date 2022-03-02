package defpackage;

import android.util.Log;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: xyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyi {
    public static xnd a(boolean z, xjo xjo, xnd xnd, Exception exc, yaz yaz, int i) {
        xnd xnd2;
        String str;
        xjo xjo2 = xjo;
        xnd xnd3 = xnd;
        Exception exc2 = exc;
        yaz yaz2 = yaz;
        Log.e("FSA2_GrpcExceptionHandler", String.format(Locale.US, "Exception when doing operation %s to dataType %s", new Object[]{Integer.valueOf(xnd3.e), Integer.valueOf(xjo2.h)}), exc2);
        xnd xnd4 = xnd.UNSPECIFIED;
        if (exc2 instanceof JSONException) {
            ((ybh) yaz2).a.stats.numParseExceptions++;
            str = "JSON_EXCEPTION";
            xnd2 = xnd4;
        } else if (exc2 instanceof ArrayStoreException) {
            ((ybh) yaz2).a.stats.numParseExceptions++;
            str = "ARRAY_STORE_EXCEPTION";
            xnd2 = xnd4;
        } else if (exc2 instanceof xya) {
            ((ybh) yaz2).a.stats.numIoExceptions++;
            str = "PEOPLE_SYNC_GRPC_EXCEPTION";
            xnd2 = xnd4;
        } else if (exc2 instanceof eif) {
            ((ybh) yaz2).a.stats.numAuthExceptions++;
            str = "GOOGLE_AUTH_EXCEPTION";
            xnd2 = xnd4;
        } else if (exc2 instanceof babk) {
            babk babk = (babk) exc2;
            String name = babk.a.r.name();
            babg babg = babg.OK;
            int ordinal = babk.a.r.ordinal();
            if (ordinal == 3) {
                xip.a();
                if (((Boolean) xga.a.a()).booleanValue()) {
                    ((ybh) yaz2).a.stats.numParseExceptions++;
                } else {
                    ((ybh) yaz2).a.stats.numIoExceptions++;
                }
            } else if (ordinal == 9 || ordinal == 12 || ordinal == 15) {
                ((ybh) yaz2).a.stats.numParseExceptions++;
            } else if (ordinal == 5) {
                xnd4 = xnd.UNSPECIFIED;
                int ordinal2 = xnd.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        ((ybh) yaz2).a.stats.numParseExceptions++;
                    } else {
                        yaz.a(xnd, xjo, z, 3, i);
                        xnd4 = xnd.REMOVE;
                    }
                } else if (!z) {
                    if (xjo2 == xjo.PHOTO) {
                        ((ybh) yaz2).a.stats.numParseExceptions++;
                    } else {
                        xnd4 = xnd.REMOVE;
                    }
                } else if (xjo2 == xjo.PHOTO && xnd3 == xnd.UPDATE) {
                    if (babk.getMessage().contains("Contact not found")) {
                        ((ybh) yaz2).a.stats.numParseExceptions++;
                    } else {
                        ((ybh) yaz2).a.stats.numIoExceptions++;
                    }
                }
            } else if (ordinal != 6) {
                ((ybh) yaz2).a.stats.numIoExceptions++;
            } else {
                ((ybh) yaz2).a.stats.numParseExceptions++;
            }
            str = name;
            xnd2 = xnd4;
        } else if (exc2 instanceof xxy) {
            str = String.valueOf(((xxy) exc2).a);
            ((ybh) yaz2).a.stats.numIoExceptions++;
            xnd2 = xnd4;
        } else {
            ((ybh) yaz2).a.stats.numIoExceptions++;
            str = "UNKNOWN_EXCEPTION";
            xnd2 = xnd4;
        }
        if (xnd2 == xnd.UNSPECIFIED) {
            yaz2.a(xjo, xnd, str, exc2);
            yaz.a(xnd, xjo, z, 2, i);
        }
        return xnd2;
    }
}
