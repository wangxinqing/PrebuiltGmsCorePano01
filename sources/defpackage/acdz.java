package defpackage;

import com.google.android.gms.smartdevice.d2d.data.MessagePayload;

/* renamed from: acdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdz {
    public static MessagePayload a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.e(bArr);
        return messagePayload;
    }
}
