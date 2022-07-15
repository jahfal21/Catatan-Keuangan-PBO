package tubes;

/**
 *
 * @author angel
 */

public class ModelCatatanKeuangan {
    private int IDCatatanKeuangan;
    private int Pemasukan;
    private int Pengeluaran;
    
    public void setIDCatatanKeuangan(int IDIDCatatanKeuangan){
        this.IDCatatanKeuangan = IDIDCatatanKeuangan;
    }
    
    public void setPemasukan(int Pemasukan){
        this.Pemasukan = Pemasukan;
    }
    
    public void setPengeluaran(int Pengeluaran){
        this.Pengeluaran = Pengeluaran;
    }
    
    public int getIDCatatanBersama(){
            return IDCatatanKeuangan;
    }
        
    public int getPemasukan(){
        return Pemasukan;
    }
        
    public int getPengeluaran(){
        return Pengeluaran;
    }
    
}
