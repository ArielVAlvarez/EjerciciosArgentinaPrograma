package clase05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class carrito {

		private persona per1;
		private producto pr1;
		private producto pr2;
		private producto pr3;
		private LocalDateTime fechacompra;
		public carrito(persona per1, producto pr1, producto pr2, producto pr3, LocalDateTime fechacompra) {
			super();
			this.per1 = per1;
			this.pr1 = pr1;
			this.pr2 = pr2;
			this.pr3 = pr3;
			this.fechacompra = fechacompra;
		}
		public persona getPer1() {
			return per1;
		}
		public void setPer1(persona per1) {
			this.per1 = per1;
		}
		public producto getPr1() {
			return pr1;
		}
		public void setPr1(producto pr1) {
			this.pr1 = pr1;
		}
		public producto getPr2() {
			return pr2;
		}
		public void setPr2(producto pr2) {
			this.pr2 = pr2;
		}
		public producto getPr3() {
			return pr3;
		}
		public void setPr3(producto pr3) {
			this.pr3 = pr3;
		}
		public LocalDateTime getFechacompra() {
			return fechacompra;
		}
		public void setFechacompra(LocalDateTime fechacompra) {
			this.fechacompra = fechacompra;
		}
		public Double costofinal() {
			Double sumatoria = 0.0;
			sumatoria=sumatoria+pr1.costofinal()+pr2.costofinal()+pr3.costofinal();
			return sumatoria;
		}
}
