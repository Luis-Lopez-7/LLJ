using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio1
{
    public partial class Form1 : Form
    {
        double total;
        public Form1()
        {
            InitializeComponent();
            total = 0;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            double temporal = 0.0;
            // Console.WriteLine("Este es ekl boton aceotar");
            var r = double.TryParse(textBox1.Text.Trim(), out temporal);
            if (r)
            {
                textBox1.Text = "";
                total += temporal;
                
            }
            else
            {
                MessageBox.Show("El valor debe de ser un numerico");
            }


        }

        private void btnIgual_Click(object sender, EventArgs e)
        {
            textBox2.AppendText(total.ToString());
        }
    }
    
}
