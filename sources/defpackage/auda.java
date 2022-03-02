package defpackage;

import java.io.IOException;

/* renamed from: auda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class auda extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public auda(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static auda a() {
        return new auda("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static auda b() {
        return new auda("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static auda c() {
        return new auda("CodedInputStream encountered a malformed varint.");
    }

    static auda d() {
        return new auda("Protocol message contained an invalid tag (zero).");
    }

    static auda e() {
        return new auda("Protocol message end-group tag did not match expected tag.");
    }

    static aucz f() {
        return new aucz("Protocol message tag had invalid wire type.");
    }

    static auda g() {
        return new auda("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static auda h() {
        return new auda("Failed to parse the message.");
    }

    static auda i() {
        return new auda("Protocol message had invalid UTF-8.");
    }

    public auda(String str) {
        super(str);
    }

    public auda(String str, IOException iOException) {
        super(str, iOException);
    }
}
