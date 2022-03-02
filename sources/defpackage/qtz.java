package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: qtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtz extends LevelDb {
    public qtz() {
        super(-1, "");
    }

    /* access modifiers changed from: protected */
    public final void closeNativeObject() {
    }

    public final void delete(byte[] bArr) {
    }

    public final int deleteRange(byte[] bArr, byte[] bArr2) {
        return 0;
    }

    public final byte[] get(LevelDb.Snapshot snapshot, byte[] bArr) {
        return null;
    }

    public final byte[] get(byte[] bArr) {
        return null;
    }

    public final LevelDb.Snapshot getSnapshot() {
        return new qty(this);
    }

    public final LevelDb.Iterator iterator() {
        return new qtx(this);
    }

    public final void put(byte[] bArr, byte[] bArr2) {
    }

    public final void write(WriteBatch writeBatch) {
    }

    public final LevelDb.Iterator iterator(LevelDb.Snapshot snapshot) {
        return new qtx(this);
    }
}
