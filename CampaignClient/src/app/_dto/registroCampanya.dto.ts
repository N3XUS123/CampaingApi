export class RegistroCampanyaDto {
    nombreCampanya: string;
    codigo: string;

    constructor(n: string, c: string) {
        this.nombreCampanya = n;
        this.codigo = c;
    }
}