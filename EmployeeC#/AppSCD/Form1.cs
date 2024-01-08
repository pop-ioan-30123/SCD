using MySql.Data.MySqlClient;
using System.Data;
using System.Diagnostics.Metrics;

namespace AppSCD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label14_Click(object sender, EventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            string departmenttable = "Select * from department";
            MySqlCommand cmd = new MySqlCommand(departmenttable, conn);
            MySqlDataReader reader = cmd.ExecuteReader();
            DataTable dt = new DataTable();
            dt.Load(reader);
            dataGridView1.DataSource = dt;
        }

        private void button9_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            string employeetable = "Select * from employee";
            MySqlCommand cmd = new MySqlCommand(employeetable, conn);
            MySqlDataReader reader = cmd.ExecuteReader();
            DataTable dt = new DataTable();
            dt.Load(reader);
            dataGridView2.DataSource = dt;
        }

        private void button2_Click(object sender, EventArgs e)
        {

            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox6.Text == "")
                MessageBox.Show("The ID is Invalid!");
            else
            {
                int IdNo = Int32.Parse(textBox6.Text);
                string iddel = "Delete from department where departmentid =" + IdNo;
                MySqlCommand cmd = new MySqlCommand(iddel, conn);
                int i = cmd.ExecuteNonQuery();
                MessageBox.Show("Department deleted succesfully.");
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox6.Text == "")
                MessageBox.Show("The ID is invalid!");
            else
            {

                int IdNo = Int32.Parse(textBox6.Text);
                if (textBox1.Text != "")
                {
                    string modifydepartment = "Update department set department_name=\"" + textBox1.Text + "\" where departmentid=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox2.Text != "")
                {
                    string modifydepartment = "Update department set description= \"" + textBox2.Text + "\" where departmentid=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox3.Text != "")
                {
                    string modifydepartment = "Update department set established_date=" + textBox3.Text + " where departmentid=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox4.Text != "")
                {
                    string modifydepartment = "Update department set location=\"" + textBox4.Text + "\" where departmentid=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox5.Text != "")
                {
                    string modifydepartment = "Update department set manager_id=" + textBox5.Text + " where departmentid=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                MessageBox.Show("Department updated succesfully.");

            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || textBox5.Text == "")
                MessageBox.Show("All columns must be filled!");
            else
            {
                int z = Int32.Parse(dataGridView1.RowCount.ToString());
                string insertion = "Insert into department " +
                    "values(" + z + ", '" + textBox1.Text + "', '" + textBox2.Text + "', " + textBox3.Text + ", '" + textBox4.Text + "', " + textBox5.Text + ", 0 )";
                MySqlCommand cmd1 = new MySqlCommand(insertion, conn);
                int i = cmd1.ExecuteNonQuery();

                MessageBox.Show("Department added to database succesfully.");
            }
        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void button8_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox7.Text == "")
                MessageBox.Show("The ID is Invalid!");
            else
            {
                int IdNo = Int32.Parse(textBox7.Text);
                string iddel = "Delete from employee where id =" + IdNo;
                MySqlCommand cmd = new MySqlCommand(iddel, conn);
                int i = cmd.ExecuteNonQuery();
                MessageBox.Show("Employee deleted succesfully.");
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox7.Text == "")
                MessageBox.Show("The ID is invalid!");
            else
            {

                int IdNo = Int32.Parse(textBox7.Text);
                if (textBox12.Text != "")
                {
                    string modifydepartment = "Update employee set name=\"" + textBox12.Text + "\" where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox10.Text != "")
                {
                    string modifydepartment = "Update employee set email= \"" + textBox10.Text + "\" where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox9.Text != "")
                {
                    string modifydepartment = "Update employee set phone_number= \"" + textBox9.Text + "\" where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox11.Text != "")
                {
                    string modifydepartment = "Update employee set position=\"" + textBox11.Text + "\" where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox8.Text != "")
                {
                    string modifydepartment = "Update employee set manager_id=" + textBox8.Text + " where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                if (textBox13.Text != "")
                {
                    string modifydepartment = "Update employee set department_id=" + textBox13.Text + " where id=" + IdNo;
                    MySqlCommand cmd = new MySqlCommand(modifydepartment, conn);
                    int i = cmd.ExecuteNonQuery();
                }

                MessageBox.Show("Employee updated succesfully.");

            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            string connstring = "server=localhost;uid=root;pwd=root22;database=departmentmanagement";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = connstring;
            conn.Open();

            if (textBox12.Text == "" || textBox10.Text == "" || textBox9.Text == "" || textBox11.Text == "" || textBox8.Text == "" || textBox13.Text =="")
                MessageBox.Show("All columns must be filled!");
            else
            {
                int z = Int32.Parse(dataGridView2.RowCount.ToString());
                string insertion = "Insert into employee(id, department_id, email, manager_id, name, phone_number, position) " +
                    "values(" + z + ", " + textBox13.Text + ", '" + textBox10.Text + "', " + textBox8.Text + ", '" + textBox12.Text + "', '" + textBox9.Text + "', '" + textBox11.Text + "')";
                MySqlCommand cmd1 = new MySqlCommand(insertion, conn);
                int i = cmd1.ExecuteNonQuery();

                MessageBox.Show("Employee added to database succesfully.");
            }
        }
    }
}