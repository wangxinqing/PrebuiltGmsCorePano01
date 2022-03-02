package defpackage;

import com.google.android.gms.drive.auth.AppIdentity;
import org.json.JSONException;

/* renamed from: kmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum kmb implements lsb {
    CONTENT_ETAG(r1),
    CONTENT_TYPE(r1),
    ENCRYPTION_KEY(r1),
    ENCRYPTION_ALGORITHM(r1),
    OWNED_FILE_PATH(r1),
    NOT_OWNED_FILE_PATH(r1),
    LAST_OPENED_TIME(r1),
    LAST_MODIFIED_TIME(r1),
    SERVER_SIDE_LAST_MODIFIED_TIME(r1),
    MD5_CHECKSUM(r1),
    IS_TEMPORARY(r1),
    REFERENCED_CONTENT_ID(r1),
    IS_DIRTY(r1);
    
    private final kqh o;

    static {
        kqs b = kqs.b();
        b.a(1, new kqm("contentETag", 2));
        b.b(25);
        CONTENT_ETAG = new kmb("CONTENT_ETAG", 0, b);
        kqs b2 = kqs.b();
        kqm kqm = new kqm("contentType", 2);
        kqm.b();
        b2.a(1, kqm);
        b2.b(25);
        CONTENT_TYPE = new kmb("CONTENT_TYPE", 1, b2);
        kqs b3 = kqs.b();
        b3.a(1, new kqm("encryptionKey", 3));
        b3.b(25);
        ENCRYPTION_KEY = new kmb("ENCRYPTION_KEY", 2, b3);
        kqs b4 = kqs.b();
        b4.a(1, new kqm("encryptionAlgorithm", 2));
        b4.b(25);
        ENCRYPTION_ALGORITHM = new kmb("ENCRYPTION_ALGORITHM", 3, b4);
        kqs b5 = kqs.b();
        b5.a(1, new kqm("filePath", 2));
        b5.b(25);
        OWNED_FILE_PATH = new kmb("OWNED_FILE_PATH", 4, b5);
        kqs b6 = kqs.b();
        b6.a(1, new kqm("notOwnedFilePath", 2));
        b6.b(25);
        NOT_OWNED_FILE_PATH = new kmb("NOT_OWNED_FILE_PATH", 5, b6);
        kqs b7 = kqs.b();
        b7.a(1, new kqm("lastOpenedTime", 1));
        b7.b(25);
        LAST_OPENED_TIME = new kmb("LAST_OPENED_TIME", 6, b7);
        kqs b8 = kqs.b();
        b8.a(1, new kqm("lastModifiedTime", 1));
        b8.b(25);
        LAST_MODIFIED_TIME = new kmb("LAST_MODIFIED_TIME", 7, b8);
        kqs b9 = kqs.b();
        b9.a(1, new kqm("serverSideLastModifiedTime", 1));
        b9.b(25);
        SERVER_SIDE_LAST_MODIFIED_TIME = new kmb("SERVER_SIDE_LAST_MODIFIED_TIME", 8, b9);
        kqs b10 = kqs.b();
        b10.a(1, new kqm("md5Checksum", 2));
        b10.b(25);
        MD5_CHECKSUM = new kmb("MD5_CHECKSUM", 9, b10);
        kqs b11 = kqs.b();
        b11.a(1, new kqm("isTemporary", 1));
        b11.b(25);
        IS_TEMPORARY = new kmb("IS_TEMPORARY", 10, b11);
        kqs b12 = kqs.b();
        kqm kqm2 = new kqm("referencedContentId", 1);
        kqm2.a(kmc.a.a, kqn.SET_NULL);
        kqm2.a();
        b12.a(1, kqm2);
        b12.b(25);
        REFERENCED_CONTENT_ID = new kmb("REFERENCED_CONTENT_ID", 11, b12);
        kqs b13 = kqs.b();
        kqm kqm3 = new kqm("isDirty", 1);
        kqm3.a((Object) 0);
        kqm3.b();
        b13.a(1, kqm3);
        b13.b(25);
        IS_DIRTY = new kmb("IS_DIRTY", 12, b13);
        kqs b14 = kqs.b();
        kqm kqm4 = new kqm("creatorIdentity", 2);
        try {
            kqm4.a((Object) AppIdentity.a.a().toString());
            kqm4.b();
            b14.a(1, kqm4);
            b14.b(25);
            kmb kmb = new kmb("CREATOR_IDENTITY", 13, b14);
            n = kmb;
            p = new kmb[]{CONTENT_ETAG, CONTENT_TYPE, ENCRYPTION_KEY, ENCRYPTION_ALGORITHM, OWNED_FILE_PATH, NOT_OWNED_FILE_PATH, LAST_OPENED_TIME, LAST_MODIFIED_TIME, SERVER_SIDE_LAST_MODIFIED_TIME, MD5_CHECKSUM, IS_TEMPORARY, REFERENCED_CONTENT_ID, IS_DIRTY, kmb};
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private kmb(kqs kqs) {
        this.o = kqs.a(173, kmc.a);
    }
}
