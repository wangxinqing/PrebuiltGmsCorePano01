package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxp implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private agxr E = null;
    private boolean F;
    private boolean G;
    private agxr H = null;
    private boolean I;
    private agxr J = null;
    private boolean K;
    private agxr L = null;
    private boolean M;
    private agxr N = null;
    private boolean O;
    private agxr P = null;
    private String Q = "";
    private boolean R;
    private String S = "";
    private boolean T;
    private String U = "";
    private boolean V;
    private boolean W;
    private boolean X = false;
    private boolean Y = false;
    private boolean Z;
    public agxr a = null;
    private String aa = "";
    private boolean ab = false;
    private boolean ac = false;
    public agxr b = null;
    public agxr c = null;
    public agxr d = null;
    public agxr e = null;
    public agxr f = null;
    public agxr g = null;
    public agxr h = null;
    public agxr i = null;
    public agxr j = null;
    public agxr k = null;
    public int l = 0;
    public String m = "";
    public boolean n;
    public String o = "";
    public String p = "";
    public String q = "";
    public final List r = new ArrayList();
    public final List s = new ArrayList();
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            agxr agxr = new agxr();
            agxr.readExternal(objectInput);
            this.t = true;
            this.a = agxr;
        }
        if (objectInput.readBoolean()) {
            agxr agxr2 = new agxr();
            agxr2.readExternal(objectInput);
            this.u = true;
            this.b = agxr2;
        }
        if (objectInput.readBoolean()) {
            agxr agxr3 = new agxr();
            agxr3.readExternal(objectInput);
            this.v = true;
            this.c = agxr3;
        }
        if (objectInput.readBoolean()) {
            agxr agxr4 = new agxr();
            agxr4.readExternal(objectInput);
            this.w = true;
            this.d = agxr4;
        }
        if (objectInput.readBoolean()) {
            agxr agxr5 = new agxr();
            agxr5.readExternal(objectInput);
            this.x = true;
            this.e = agxr5;
        }
        if (objectInput.readBoolean()) {
            agxr agxr6 = new agxr();
            agxr6.readExternal(objectInput);
            this.y = true;
            this.f = agxr6;
        }
        if (objectInput.readBoolean()) {
            agxr agxr7 = new agxr();
            agxr7.readExternal(objectInput);
            this.z = true;
            this.g = agxr7;
        }
        if (objectInput.readBoolean()) {
            agxr agxr8 = new agxr();
            agxr8.readExternal(objectInput);
            this.A = true;
            this.h = agxr8;
        }
        if (objectInput.readBoolean()) {
            agxr agxr9 = new agxr();
            agxr9.readExternal(objectInput);
            this.B = true;
            this.i = agxr9;
        }
        if (objectInput.readBoolean()) {
            agxr agxr10 = new agxr();
            agxr10.readExternal(objectInput);
            this.C = true;
            this.j = agxr10;
        }
        if (objectInput.readBoolean()) {
            agxr agxr11 = new agxr();
            agxr11.readExternal(objectInput);
            this.D = true;
            this.E = agxr11;
        }
        if (objectInput.readBoolean()) {
            agxr agxr12 = new agxr();
            agxr12.readExternal(objectInput);
            this.F = true;
            this.k = agxr12;
        }
        if (objectInput.readBoolean()) {
            agxr agxr13 = new agxr();
            agxr13.readExternal(objectInput);
            this.G = true;
            this.H = agxr13;
        }
        if (objectInput.readBoolean()) {
            agxr agxr14 = new agxr();
            agxr14.readExternal(objectInput);
            this.I = true;
            this.J = agxr14;
        }
        if (objectInput.readBoolean()) {
            agxr agxr15 = new agxr();
            agxr15.readExternal(objectInput);
            this.K = true;
            this.L = agxr15;
        }
        if (objectInput.readBoolean()) {
            agxr agxr16 = new agxr();
            agxr16.readExternal(objectInput);
            this.M = true;
            this.N = agxr16;
        }
        if (objectInput.readBoolean()) {
            agxr agxr17 = new agxr();
            agxr17.readExternal(objectInput);
            this.O = true;
            this.P = agxr17;
        }
        this.Q = objectInput.readUTF();
        this.l = objectInput.readInt();
        this.m = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.R = true;
            this.S = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.T = true;
            this.U = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.n = true;
            this.o = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.V = true;
            this.p = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.W = true;
            this.q = readUTF5;
        }
        this.X = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            agxo agxo = new agxo();
            agxo.readExternal(objectInput);
            this.r.add(agxo);
        }
        int readInt2 = objectInput.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            agxo agxo2 = new agxo();
            agxo2.readExternal(objectInput);
            this.s.add(agxo2);
        }
        this.Y = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.Z = true;
            this.aa = readUTF6;
        }
        this.ab = objectInput.readBoolean();
        this.ac = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.t);
        if (this.t) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.E.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.J.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K);
        if (this.K) {
            this.L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M);
        if (this.M) {
            this.N.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O);
        if (this.O) {
            this.P.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.Q);
        objectOutput.writeInt(this.l);
        objectOutput.writeUTF(this.m);
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            objectOutput.writeUTF(this.S);
        }
        objectOutput.writeBoolean(this.T);
        if (this.T) {
            objectOutput.writeUTF(this.U);
        }
        objectOutput.writeBoolean(this.n);
        if (this.n) {
            objectOutput.writeUTF(this.o);
        }
        objectOutput.writeBoolean(this.V);
        if (this.V) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.X);
        int size = this.r.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((agxo) this.r.get(i2)).writeExternal(objectOutput);
        }
        int size2 = this.s.size();
        objectOutput.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            ((agxo) this.s.get(i3)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.aa);
        }
        objectOutput.writeBoolean(this.ab);
        objectOutput.writeBoolean(this.ac);
    }
}
